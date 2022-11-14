package objetos.parcial3.examen;

import java.util.List;

public class TravelAgency {
    private List<UserAccount> userAccount;
    private String id;
    public String  addUserAccount(UserAccount userAccount) {
        this.id.concat(userAccount.getEmail() + userAccount.getName() + userAccount.getPhoneNumber() +
                userAccount.getZipCode());
        userAccount.setId(this.id);
        this.userAccount.add(userAccount);
        return id;
    }

    public UserAccount findAccount (String id){
        UserAccount findAcount;
        for (int i = 0;i  < userAccount.size();i++){
            findAcount = userAccount.get(i);
            if (findAcount.getId().equals(id)) {
                return findAcount;
            }
        }
        return null;
    }

    public UserAccount findAccountByEmail (String email){
        UserAccount findAcount;
        for (int i = 0;i  < userAccount.size();i++){
            findAcount = userAccount.get(i);
            if (findAcount.getEmail().equals(email)) {
                return findAcount;
            }
        }
        return null;
    }

    public UserAccount findAccountByPhoneNumber (String phoneNUmber){
        UserAccount findAcount;
        for (int i = 0;i  < userAccount.size();i++){
            findAcount = userAccount.get(i);
            if (findAcount.getPhoneNumber().equals(phoneNUmber)){
                return findAcount;
            }
        }
        return null;
    }

    public UserAccount removeAccount(String id){
        UserAccount findAcount;
        for (int i = 0;i  < userAccount.size();i++){
            findAcount = userAccount.get(i);
            if (findAcount.getPhoneNumber().equals(id)){
                userAccount.remove(i);
                return findAcount;
            }
        }
        return null;
    }
}
