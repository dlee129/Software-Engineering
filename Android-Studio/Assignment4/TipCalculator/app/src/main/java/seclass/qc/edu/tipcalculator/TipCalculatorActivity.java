package seclass.qc.edu.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipCalculatorActivity extends AppCompatActivity {

    //initialize all the numbers that are inputs and being computed
    int check_Amount;
    int party_Size;
    int fifteen_Tip_Value;
    int twenty_Tip_Value;
    int twenty_five_Tip_Value;
    int fifteen_Total_Value;
    int twenty_Total_Value;
    int twenty_five_Total_Value;

    //TextView allows a string to be shown when it is set a string value
    TextView fifteen_Tip_Value_Result;
    TextView twenty_Tip_Value_Result;
    TextView twenty_five_Tip_Value_Result;
    TextView fifteen_Total_Value_Result;
    TextView twenty_Total_Value_Result;
    TextView twenty_five_Total_Value_Result;

    //Button is used for onClick function for Computing Tip
    Button compute_Tip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        /*
         * Button is being initialized first since Check Amount
         * and party size need to be entered first
         * setOnClickListener gives the button functionality once it is pressed
         */
        compute_Tip = (Button) findViewById(R.id.buttonCompute);
        compute_Tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                EditText is the data type for inputting values for the app
                then it will receive the input in the form of string after calling getText()
                and then parse the string to integers since we want numbers
                 */
                EditText check_Amount_input = (EditText) findViewById(R.id.checkAmountValue);
                EditText party_Size_input = (EditText) findViewById(R.id.partySizeValue);
                String check = check_Amount_input.getText().toString();
                String party = party_Size_input.getText().toString();

                check_Amount = Integer.parseInt(check);
                party_Size = Integer.parseInt(party);

                /*
                Toast provides feedback about an operation in this case
                if the user is trying to provide an empty or invalid number
                 */
                if(check_Amount <=0 || party_Size <=0 || check == null || party == null){
                    Toast toast =  Toast.makeText(TipCalculatorActivity.this, "Empty or incorrect value(s)!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                /*
                All the values are calculated according the tip percentage they are
                and then are setText to be the integer value to a string
                to show up on the lines next to each corresponding percentage
                 */
                else {
                    fifteen_Tip_Value = (int) Math.round((check_Amount / party_Size) * .15);
                    twenty_Tip_Value = (int) Math.round((check_Amount / party_Size) * .2);
                    twenty_five_Tip_Value = (int) Math.round((check_Amount / party_Size) * .25);
                    fifteen_Total_Value = check_Amount / party_Size + fifteen_Tip_Value;
                    twenty_Total_Value = check_Amount / party_Size + twenty_Tip_Value;
                    twenty_five_Total_Value = check_Amount / party_Size + twenty_five_Tip_Value;

                    fifteen_Tip_Value_Result = (TextView) findViewById(R.id.fifteenPercentTipValue);
                    fifteen_Tip_Value_Result.setText(Integer.toString(fifteen_Tip_Value));

                    twenty_Tip_Value_Result = (TextView) findViewById(R.id.twentyPercentTipValue);
                    twenty_Tip_Value_Result.setText(Integer.toString(twenty_Tip_Value));

                    twenty_five_Tip_Value_Result = (TextView) findViewById(R.id.twentyfivePercentTipValue);
                    twenty_five_Tip_Value_Result.setText(Integer.toString(twenty_five_Tip_Value));

                    fifteen_Total_Value_Result = (TextView) findViewById(R.id.fifteenPercentTotalValue);
                    fifteen_Total_Value_Result.setText(Integer.toString(fifteen_Total_Value));

                    twenty_Total_Value_Result = (TextView) findViewById(R.id.twentyPercentTotalValue);
                    twenty_Total_Value_Result.setText(Integer.toString(twenty_Total_Value));

                    twenty_five_Total_Value_Result = (TextView) findViewById(R.id.twentyfivePercentTotalValue);
                    twenty_five_Total_Value_Result.setText(Integer.toString(twenty_five_Total_Value));
                }
            }
        });

    }

}
