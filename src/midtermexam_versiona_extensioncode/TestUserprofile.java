/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestUserprofile {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        UserProfile up = new UserProfile();
        
        System.out.println("What is the name of the Profile?: ");
        
        String userName = in.next();
        
        up.setUserID(userName);
        
        for(int i=0; i<up.getGenres().length; i++){
            System.out.println(up.getGenres());
        }
        
        System.out.println(up.getGenre());
        System.out.println("Choose you genre?: ");
        
        String genre = in.next();
        up.setGenre(genre);
        
        System.out.println("User profile created: User name: " + up.getUserID() + " Genre Chosen: " + up.getGenre());
        
        
        
    }
    
}
