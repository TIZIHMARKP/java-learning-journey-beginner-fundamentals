

public  static void main() {
    //   SWITCH STATEMENTS
//    It falls under the categories of a if statement but a little bit different
    String gender = "Female";

    if(gender.equals("FEMALE")){

    } else if (gender.equals("MALE")){

    } else if (gender.equals(("PREFER_NOT_SAY"))){

    } else {

    }

    switch (gender.toUpperCase()){
        case "FEMALE":
            System.out.println("I am a female");
            break;
        case "MALE":
            System.out.println("I am a male");
            break;
        case "PREFER_NOT_SAY":
            System.out.println("I prefere not say");
            break;
        default:
            System.out.println("Unknow gender");

    }

//    Switch statements should be used only when you are switching on single values


}



