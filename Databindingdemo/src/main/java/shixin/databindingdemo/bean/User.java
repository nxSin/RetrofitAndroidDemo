package shixin.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayList;

/**
 * Created by shixin on 2017/9/19.
 */

public class User extends BaseObservable {
    private String name;
    private int age;
    private boolean isMan;

    private ObservableArrayList<String> string = new ObservableArrayList<>();

    public User(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        string.add("11");
        string.add("22");
        string.add("33");
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Bindable
    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
//        notifyChange();
    }

    public ObservableArrayList<String> getString() {
        return string;
    }

    public void setString(ObservableArrayList<String> string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
