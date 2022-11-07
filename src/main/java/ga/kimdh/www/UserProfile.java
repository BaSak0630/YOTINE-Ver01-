package ga.kimdh.www;

import android.util.Log;
import android.view.View;

public class UserProfile
{
    public String name;
    public String phone;
    public String address;

    public UserProfile(String name, String phone, String address)
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String toString()
    {
        return "UserProfile name="+ name + ",phone=" + phone + ",address=" + address;
    }
}
