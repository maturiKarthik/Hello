# Hello
This is my project sharing on github
This file countains simple code for intent and call between two 
activities


CODE SNIPPET:
**************


 public void intentController(){
        // Starting a new intent
        try{
            Log.d("inside","Inside  the try above intent");
            Intent i = new Intent(this, MainInt.class);
            startActivity(i);
            Log.d("inside","Ibelow intent");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
