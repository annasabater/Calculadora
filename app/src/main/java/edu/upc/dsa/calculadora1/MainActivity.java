package edu.upc.dsa.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button buttonDiv, buttonMult, buttonSuma, buttonResta, buttonIgual, buttonAC, buttonSin, buttonCos, buttonTan;
    float valueOne, valueTwo;
    boolean isAdd, isSubtract, isMultiply, isDivide, isIgual, isAc, isSin, isCos, isTan ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuma = findViewById(R.id.button_suma);
        buttonResta = findViewById(R.id.button_resta);
        buttonMult = findViewById(R.id.button_multi);
        buttonDiv = findViewById(R.id.button_division);
        buttonSin = findViewById(R.id.button_sin);
        buttonCos = findViewById(R.id.button_cos);
        buttonTan = findViewById(R.id.button_tan);
        buttonIgual = findViewById(R.id.button_igual);
        buttonAC = findViewById(R.id.button_ac);

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isAdd = true;
                    editText.setText(null);
                }
            }
        });

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isSubtract = true;
                    editText.setText(null);
                }
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isMultiply = true;
                    editText.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isDivide = true;
                    editText.setText(null);
                }
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isSin = true;
                    editText.setText(null);
                }
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isCos = true;
                    editText.setText(null);
                }
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isTan = true;
                    editText.setText(null);
                }
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isIgual = true;
                    editText.setText(null);
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    isAc = true;
                    editText.setText(null);
                }
            }
        });

    }
}
