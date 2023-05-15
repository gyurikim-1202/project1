package ch20.oracle.sec09.exam02;
//boards 테이블의 1개 행(게시물)을 저장할 Board 클래스

import java.sql.Blob;
import java.sql.Date;

import lombok.Data;

@Data //Constructor, Getter, Setter, hashCode(), equals(), toString() 자동 생성
public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfilename;
	private Blob bfiledata;
}