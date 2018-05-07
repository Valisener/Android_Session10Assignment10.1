package a1.assignment10.acadgild.com.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.plus.PlusOneButton;

import org.w3c.dom.Text;

/**
 * A fragment with a Google +1 button.
 * Activities that contain this fragment must implement the
 * {@link SimpleAddition.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SimpleAddition#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleAddition extends Fragment {
    private OnFragmentInteractionListener mListener;
//    Blank constructor
    public SimpleAddition() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SimpleAddition.
     */
    public static SimpleAddition newInstance() {
        SimpleAddition fragment = new SimpleAddition();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_addition, container, false);
        //Initialize button and reference it
        Button   button = view.findViewById(R.id.btnSubmit);
        //Initialize EditText and reference it
        final EditText editText = view.findViewById(R.id.editBox);
        //Initialize TextView and reference it
        final TextView textView = view.findViewById(R.id.textView);
        //Give button a click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set the text for the TextView to the string from EditText
                textView.setText(editText.getText());
            }
        });
        //Return the view
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        // Refresh the state of the +1 button each time the activity receives focus.
//        mPlusOneButton.initialize(PLUS_ONE_URL, PLUS_ONE_REQUEST_CODE);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        Didnt need so commented this stuff out
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
//        Didnt bother with this since it wasnt needed
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
