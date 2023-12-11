package com.multi.mvc02;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List; // 수정된 부분

@Repository
public class BookDAO {

    @Autowired
    SqlSessionTemplate my;

    public int update(BookDTO dto) {
        return my.update("book.update", dto);
    }

    public int insert(BookDTO dto) {
        return my.insert("book.create", dto);
    }

    public int delete(BookDTO dto) {
        int result = my.delete("book.delete", dto); // 수정된 부분
        return result;
    }

    public BookDTO one(String id) {
       return my.selectOne("book.one", id);
    }

    public List<BookDTO> list() { // 수정된 부분
        List<BookDTO> list = my.selectList("book.list");
        return list;
    }
}
