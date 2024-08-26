package com.example.quiz.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class QuizForm {

	/** 識別ID */
	private Integer id;

	/** クイズの内容 */
	@NotBlank
	private String question;

	private Boolean answer;

	/** 作成者 */
	@NotBlank
	private String author;

	/**
	 *  「登録」or「変更」判定用
	 *  
	 *   登録用のデータと見なす場合は、true を
	 *   変更（更新）用のデータと見なす場合は、false を保持する。
	 */
	private Boolean newQuiz;

}
