package a1.assignment10.acadgild.com.myapplication;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Controls all the fragments the fragmentmanager that managed all the fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
//      New object that is of the fragment i created
        SimpleAddition simpleAddition=SimpleAddition.newInstance();
//        Begin its task of editing operations on fragments
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        add fragment simpleAddition
        fragmentTransaction.add(R.id.parentLayout, simpleAddition);
//        Commits the transaction and executes all commands
        fragmentTransaction.commit();


    }
}
