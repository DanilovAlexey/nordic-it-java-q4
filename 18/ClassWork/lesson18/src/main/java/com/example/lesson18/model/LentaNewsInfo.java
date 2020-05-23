package com.example.lesson18.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LentaNewsInfo {

	private String id;
	private String title;
	private String rightcol;
	private Long modified;
}
