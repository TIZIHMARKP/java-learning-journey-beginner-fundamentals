

public  static void main() {
    //   Break and Continue
    String[] names = {"Anna", "Ali", "Will", "Mike"};

    for(String name : names ){
        System.out.println(name);
        break;  // Stops the loop
    }

    for(String name : names ){
        if(name.equals("Will")){
            break;
        }
        System.out.println(name);
    }

    for(String name : names ){
        if(name.startsWith("A")){
            continue;
        }
        System.out.println(name);
    }

}



