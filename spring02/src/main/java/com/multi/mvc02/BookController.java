package com.multi.mvc02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @Autowired
    BookDAO dao;

    @RequestMapping("one")
    public String one(String id, Model model) { // 수정된 부분
        BookDTO dto = dao.one(id);
        model.addAttribute("dto", dto);
        return "one";
    }

    @RequestMapping("update")
    public String update(BookDTO dto) {
        int result = dao.update(dto);
        if (result == 1) {
            return "update";
        } else {
            return "redirect:book.jsp";
        }
    }

    @RequestMapping("insert")
    public String insert(BookDTO dto) {
        int result = dao.insert(dto);
        if (result == 1) {
            return "insert";
        } else {
            return "redirect:book.jsp";
        }
    }

    @RequestMapping("list") // 추가된 부분
    public String list(Model model) {
        List<BookDTO> list = dao.list();
        model.addAttribute("list", list);
        return "list"; // 수정된 부분: 어떤 뷰를 반환할지 명시
    }
}
