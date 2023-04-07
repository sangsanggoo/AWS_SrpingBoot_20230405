package com.web.study.dto.request;

import java.time.LocalDate;

import com.web.study.domain.entity.Student;

import lombok.Setter;
import lombok.ToString;
@Setter
@ToString
public class StudentReqDto {
	private int id;
	private String name;
	private LocalDate birth_date;
	
	public Student toEntity() {
		return Student.builder()
				.name(name)
				.birth_date(birth_date)
				.build();
	}
}
