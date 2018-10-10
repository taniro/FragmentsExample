package br.ufrn.eaj.tads.fragmentsexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment1 frag1 = new Fragment1();
        ft.add (R.id.layout_alvo, frag1, "Fragment1");
        ft.commit();

        */

        /*

        ft = fm.beginTransaction();
        Fragment2 frag2 = new Fragment2();
        ft.add (R.id.layout_alvo, frag2, "Fragment1");
        ft.commit();
        */

        /*

        // Create new fragment and transaction
        Fragment2 newFragment = new Fragment2();
        android.support.v4.app.FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        ft2.replace(R.id.layout_alvo, newFragment);
        ft2.addToBackStack(null);
        // Commit the transaction
        ft2.commit();

        */

    }

    public void click1(View v){
    }

    public void click2(View v){
    }
}
