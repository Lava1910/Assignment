package session4;

import java.util.ArrayList;


public class PhoneBook extends Phone{
        public ArrayList<PhoneNumber> phoneList;

    @Override
    public void insertPhone(String name, String phone) {
        for(int i = 0; i < phoneList.size();i++)
            if (phoneList.get(i).name == name)
                for(int j = 0;j < phoneList.get(i).phone.size();j++)
                    if (phoneList.get(i).phone.get(j) == phone)
                        System.out.println("Đã có");
                    else
                        phoneList.get(i).phone.add(phone);
            else
                phoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for(int i = 0; i < phoneList.size(); i++)
            if(phoneList.get(i).name == name)
                phoneList.remove(i);
            else
                System.out.println("Không có tên trùng");
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
         for(int i = 0;i < phoneList.size();i++)
             if(phoneList.get(i).name == name)
                 for(int j = 0;j<phoneList.get(i).phone.size();j++)
                     if(phoneList.get(i).phone.get(j) == oldPhone) {
                         phoneList.get(i).phone.remove(oldPhone);
                         phoneList.get(i).phone.add(newPhone);
                     }
    }

    @Override
    public void searchPhone(String name) {
        for(int i = 0;i < phoneList.size();i++)
            if(phoneList.get(i).name == name) {
                System.out.println("Số điện thoại của khách hàng " + phoneList.get(i).name + "là:");
                for(int j = 0;j<phoneList.get(i).phone.size();j++)
                    System.out.println(phoneList.get(i).phone.get(j) + "\n");
            }
    }

    @Override
    public void sort() {
        String x;
        for(int i = 0;i < phoneList.size();i++)
            for(int j = i+1;j<phoneList.size();j++)
                if(phoneList.get(j).name.equalsIgnoreCase(phoneList.get(i).name)){
                    x = phoneList.get(i).name;
                    phoneList.get(i).name = phoneList.get(j).name;
                    phoneList.get(j).name = x;
                }
    }



}
