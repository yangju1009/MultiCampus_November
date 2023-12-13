package com.multi.chat;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PJWebSocketController {

	@MessageMapping("/chat")
	@SendTo("/topic/messages") //채팅방이름 messages
	public Message send(Message message) {
		//from, text만 messages채팅방에 가입한 브라우저로 그대로 보내고 싶은 경우 
		Date date = new Date();
		message.setDate(date.getHours() + "시 " + date.getMinutes() + "분");
		return message; 
		//return에 뒤에 있는vo가 가입한 브라우저에 도착
	}
	
	@MessageMapping("/chat2")
	@SendTo("/topic/messages2") //채팅방이름 messages2
	public Message2 send2(Message2 message) {
		//from, text만 messages채팅방에 가입한 브라우저로 그대로 보내고 싶은 경우 
		String menu = "";
		
		switch (message.getText()) { //1
		case "1":
			menu = "자주 묻는 질문>>  10) 회원가입		11) 예약절차		12) 예약 오픈 일정";
			break;
		case "2":
			menu = "자주 묻는 질문>>  20) 위치	21) 작품 촬영";
			break;
		case "20":
			menu = "자주 묻는 질문>> 서울 ㅇㅇ구 ㅇㅇ동에 위치해 있습니다.  \n" +
						"자세한 내용은 오시는길 참고바랍니다";
			break;
		case "21":
			menu = "개인이 삼각대 및 플래시를 사용한 사진촬영 불가.";
			break;
		case "10":
			menu = "자주 묻는 질문>>  100) 나이커	    200) 르꼬뿌			300) 라코스또";
			break;
		case "100":
			menu = "자주 묻는 질문>>  1000) 나이커 운동화 세부 메뉴	1) 다시 처음 메뉴";
			break;
		case "1000":
			menu = "자주 묻는 질문>>  1001)나이커빨강(1만원)	1002)나이커파랑(2만원)	1003)나이커보라(3만원)	100)이전 메뉴로";
			break;
		default:
			menu = "자주 묻는 질문>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		message.setMenu(menu);
		return message; 
		//return에 뒤에 있는vo가 가입한 브라우저에 도착
	}
}