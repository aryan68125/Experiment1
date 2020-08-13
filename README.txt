# Experiment1
The above project is strictly for educational purposes here you will learn:->
1. how to use EditView and TextView for data input by the user and Data output after the calculations
2. how to use buttons and assigning different features or task it will do after user presses the button
3. onClickListener their usage on buttons by different methods : A. setting onClickListener on individual buttons
                                                                    SYNTAX:-    Button button = findViewById(R.id.button7);
                                                                                button.setOnClickListener(new View.OnClickListener() { //setting an onclick Listener on an individual button
                                                                                @Override
                                                                                public void onClick(View view) {
                                                                                editText = findViewById(R.id.editText);
                                                                                String numa = editText.getText().toString(); //value of pound
                                                                                Double doublenuma = Double.parseDouble(numa);
                                                                                Double doubleresult = doublenuma * 0.45359237 ;
                                                                                String result ="pound to kg" + doubleresult.toString();
                                                                                textView.setText(result);
                                                                                }
                                                                                });
                                                                 B. setting onClickListener on Entire MainActivity
                                                                    import the View function before implementing onClickListener
                                                                    SYNTAX:-
                                                                    public class MainActivity extends AppCompatActivity implements View.OnClickListener
                                                                    {
                                                                    Button button2 = findViewById(R.id.button2);
                                                                    button2.setOnClickListener(this);
                                                                    }
                                                                    @Override
                                                                    public void onClick(View view)
                                                                    {
                                                                     //here you will write the code for what you want to do with your button
                                                                     //for example if you want to open a new Activity on a click of a button 
                                                                       the code below if written inside this function will let you do that but make sure to add 
                                                                       another Activity on to your project before doing that
                                                                     //the code below is for multi button intent
                                                                     switch(view.getId())
                                                                     {
                    setting up button2 to open a new Activity ---->  case R.id.button2:
       here we are setting up the intent method onto button 2 ---->  Intent intent2 = new Intent(this, Activity3.class);
                                                                     startActivity(intent2);
                                                                     break;
                                                                     case R.id.button3:
                                                                     //here similarly you can code what you want to do when button3 is pressed
                                                                     }
                                                                    }
                                                                    C. Setting up clk function using xml file of a button
                                                                       here you will have to go to the xml file of the Activity and setup an onclick attribute of the button under the Declared Attributes title of the button
                                                                       public void clk(View view)
                                                                       {
                                                                       //you can code what you want to do when button is pressed
                                                                       }
4. how to String.xml file to design the Activiy.xml files (The texts used in the UI is handled by String.xml file)
                                                                    
