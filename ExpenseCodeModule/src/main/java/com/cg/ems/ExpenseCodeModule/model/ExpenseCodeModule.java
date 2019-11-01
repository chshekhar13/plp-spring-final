package com.cg.ems.ExpenseCodeModule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="expense_details")
public class ExpenseCodeModule {

	@Id
	@Column(name="expense_code")
	private int expense_code;
	@Column(name="expense_type")
	private String expense_type;
	@Column(name="expense_description")
	private String expense_description;
	
	public int getExpense_code() {
		return expense_code;
	}
	
	public void setExpense_code(int expense_code) {
		this.expense_code = expense_code;
	}
	public String getExpense_type() {
		return expense_type;
	}
	public void setExpense_type(String expense_type) {
		this.expense_type = expense_type;
	}
	public String getExpense_description() {
		return expense_description;
	}
	public void setExpense_description(String expense_description) {
		this.expense_description = expense_description;
	}
	
	@Override
	public String toString() {
		return "ExpenseCodeModule [expense_code=" + expense_code + ", expense_type=" + expense_type
				+ ", expense_description=" + expense_description + "]";
	}
	
}
