public class Logic11 {
    public static void main(String args[]){

// *
// **
// ***
// ****

// for(int i = 1; i<=4; i++){
//     for(int j = 1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


// ****
// ***
// **
// *     

            // for(int i = 1 ; i<=4; i++){
            //     for(int j = 4; j>=i; j--){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


// *
// **
// ***
// ****
// ***
// **
// *
    // for(int i = 1; i<=4; i++){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i = 1; i<=3; i++){
    //     for(int j = 3; j>=i;  j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


//      *
//     **
//    ***
//   ****
    // for(int i = 1; i<=4; i++){
    //     for(int j =3; j>=i; j--){
    //         System.out.print(" ");
    //     }
    //     for(int k = 1; k<=i; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


// ****
//  ***
//   **
//    *
    // for(int i = 1; i<=4; i++){
    //     for(int j =2; j<=i; j++){
    //         System.out.print(" ");
    //     }
    //    for(int k = 4; k>=i; k--){
    //     System.out.print("*");
    //    }
    //    System.out.println();
    // }


        // for(int i = 1; i<=5; i++){
        //     for(int j = 1; j<=5; j++){
        //         if(i>=2 && j>=2 && i<=4 && j<=4){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }


 // *
// **
// ***
// ****
// ***
// **
// *

// for(int i =1 ; i<=7; i++){
//     for(int j= 1 ; j<=4; j++){
//         if(i<=4){
//             if(j<=i){
//                 System.out.print("*");
//             }

//         }
//         else{
//             if(j<= (8-i)){
//                 System.out.print("*");
//             }
//         }
//     }
//     System.out.println();
// }

//! 1
//! 12
//! 123
//! 1234
// for(int i = 1; i<=4; i++){
//     for(int j = 1; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

//! 1
//! 22
//! 333
//! 4444
// for(int i = 1; i<=4; i++){
//     for(int j = 1; j<=i; j++){
//         System.out.print(i);
//     }
//     System.out.println();
// }

//! 1
//! 23
//! 456
//! 78910
int count = 0;
for(int i = 1; i<=4; i++){
    for(int j = 1; j<=i; j++){
        count += 1; 
        System.out.print(count + " ");
    }
    System.out.println();
}



    }
}
