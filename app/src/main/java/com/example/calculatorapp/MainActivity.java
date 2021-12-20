package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.edInput);
        input.setShowSoftInputOnFocus(false);
    }

    private void textUpdate(String strToAdd){
        String oldString = input.getText().toString();
        int cursorPos = input.getSelectionStart();
        String leftStr = oldString.substring(0, cursorPos);
        String rightStr = oldString.substring(cursorPos);

        if(input.getText().toString().matches("")){
            input.setText(strToAdd);
            if(strToAdd.equals("sqrt(")){
                input.setSelection(cursorPos + 5);
            }
            else{
                input.setSelection(cursorPos + 1);
            }
        }
        else{
            input.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
            if(strToAdd.equals("sqrt(")){
                input.setSelection(cursorPos + 5);
            }
            else{
                input.setSelection(cursorPos + 1);
            }
        }

    }
    public void onClickZero(View view){
        textUpdate("0");
    }

    public void onClickOne(View view){
        textUpdate("1");
    }

    public void onClickTwo(View view){
        textUpdate("2");
    }

    public void onCLickThree(View view){
        textUpdate("3");
    }

    public void onCLickFour(View view){
        textUpdate("4");
    }

    public void onClickFive(View view){
        textUpdate("5");
    }

    public void onClickSix(View view){
        textUpdate("6");
    }

    public void onCLickSeven(View view){
        textUpdate("7");
    }

    public void onClickEight(View view){
        textUpdate("8");
    }

    public void onClickNine(View view){
        textUpdate("9");
    }

    public void onClickRoot(View view){
        textUpdate("sqrt(");
    }

    public void onClickDivide(View view){
        textUpdate("÷");
    }

    public void onClickMultiply(View view){
        textUpdate("×");
    }

    public void onClickAdd(View view){
        textUpdate("+");
    }

    public void onClickSubtract(View view){
        textUpdate("-");
    }

    public void onClickPoint(View view){
        textUpdate(".");
    }

    public void onClickChangeSign(View view){
        textUpdate("-");
    }

    public void onClickClear(View view){
        input.setText("");
    }

    public void onClickEquals(View view){
        String userExp = input.getText().toString();
        String result = String.valueOf(getResult(userExp));

        input.setText(result);
        input.setSelection(result.length());
    }

    public void onClickParenthesis(View view){
        int cursorPos = input.getSelectionStart();
        int openPar = 0;
        int closedPar = 0;
        int textLen = input.getText().length();

        for(int i = 0; i < cursorPos; i++){
            if(input.getText().toString().charAt(i) == '('){
                openPar += 1;
            }

            if(input.getText().toString().charAt(i) == ')'){
                closedPar += 1;
            }
        }

        if(openPar == closedPar || input.getText().toString().charAt(textLen - 1) == '('){
            textUpdate("(");
        }
        else if(closedPar < openPar && input.getText().toString().charAt(textLen - 1) != '('){
            textUpdate(")");
        }

        input.setSelection(cursorPos + 1);
    }

    public void onClickDelete(View view){
        int cursorPos = input.getSelectionStart();
        int textLen = input.getText().length();

        if(cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) input.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            input.setText(selection);
            input.setSelection(cursorPos - 1);
        }
    }
    public static double getResult(String str){
        str = str.replaceAll("÷", "/");
        str = str.replaceAll("×", "*");
        Expression exp = new Expression(str);
        return exp.calculate();
    }
}