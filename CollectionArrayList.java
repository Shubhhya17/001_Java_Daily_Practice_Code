import java.util.*;
// import java.io.*;

//****************************************************************** */ 
public class CollectionArrayList {
    public static void main(String args[]) {
        try {
            ArrayList<String> al = new ArrayList<String>();
            Stack <String>s1 = new Stack<>();
            // al.add(12);
            // al.add(23);
            // al.add(10);


//! Set() method 
//? set() is used to set/update the data by passing index and new value.
//* **************************************************************** */
            // al.add("Shubham");
            // al.add("Shivam");
            // al.add("Sahil");
            // al.add("shntanu");
            // System.out.println(al);
            // al.set(0,"Shree");
            // System.out.println(al);


//! 5.size()
//? size() is used to get total number of elements in ArrayList.
//* **************************************************************** */         
            // al.add("Shubham");
            // al.add("Shivam");
            // al.add("Sahil");
            // al.add("shantanu");
            // System.out.println(al.size());

//! 6.indexOf()
//? indexOf() is used to get 1st occurance index of an ArrayList by passing element.   
//* **************************************************************** */    
// al.add("Shubham");
// al.add("Shivam");
// al.add("Sahil");
// al.add("shantanu");
// int i =al.indexOf("Shubham");     
// int j =al.indexOf("Shivam");     
// System.out.println(i);
// System.out.println(j);

//******************************************************************* */

s1.push("Anirudh");
s1.push("Manisharma");
s1.push("Dsp");
s1.push("yuvan");
System.out.println(s1); //======>[Anirudh, Manisharma, Dsp, yuvan]
System.out.println(s1.peek()); //====>yuvan
s1.pop();
System.out.println(s1);  //=============>[Anirudh, Manisharma, Dsp]


//****************************************************************** */



//******************************************************************* */

// 1.ArrayList=====>For fetching or retriving data(based on index value);
// 2.LinkedList====>For insertion and deletion data(because there is no shifting process);
// 3.Vector========(synchronized and thread safe);
// 4.Stack=========(synchronized ,thread safe and LIFO PRINCIPLE);

//***********************************************************************




        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
