package com.example.shinji.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by shinji on 2018/01/26.
 */


// BaseObservableをセットすることで、変更を受け取れる
public class User extends BaseObservable{
	private String firstName;
	private String lastName;

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Bindable
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

		// 変更を反映
		notifyPropertyChanged(BR.firstName);
	}
}