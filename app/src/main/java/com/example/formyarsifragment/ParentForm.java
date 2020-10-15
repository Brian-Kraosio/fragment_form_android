package com.example.formyarsifragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.DatePicker;

import com.example.formyarsifragment.databinding.FragmentParentFormBinding;
import com.example.formyarsifragment.model.Student;

import java.util.Calendar;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParentForm#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParentForm extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    DatePickerDialog picker;
    Student student;
    Bundle bundle;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ParentForm() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ParentForm.
     */
    // TODO: Rename and change types and number of parameters
    public static ParentForm newInstance(String param1, String param2) {
        ParentForm fragment = new ParentForm();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final FragmentParentFormBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_parent_form, container, false);

        bundle = getArguments();

        student = bundle.getParcelable("student");



//        For kota spinner
        final ArrayAdapter<CharSequence> kotaAdapter = ArrayAdapter.createFromResource(getContext(), R.array.kota, android.R.layout.simple_spinner_item);
        kotaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.kotaortu.setAdapter(kotaAdapter);

//        For Provinsi Spinner
        final ArrayAdapter<CharSequence> provinsiAdapter = ArrayAdapter.createFromResource(getContext(), R.array.provinsi, android.R.layout.simple_spinner_item);
        provinsiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.provinsiortu.setAdapter(provinsiAdapter);

//        For Tanggal Ayah listener
        binding.lahirayah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);
                picker = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                binding.lahirayah.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

//        For Tanggal Ibu Listener
        binding.lahiribu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);
                picker = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                binding.lahiribu.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        binding.alamatsama.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(binding.alamatsama.isChecked()){
                    binding.alamatorangtua.setText(student.getAlamat());
                    binding.alamatorturt.setText(student.getRT());
                    binding.alamatorturw.setText(student.getRW());
                    binding.kodeposortu.setText(student.getKode());
                    if (student.getKota() != null) {
                        int spinnerPosition = kotaAdapter.getPosition(student.getKota());
                        binding.kotaortu.setSelection(spinnerPosition);
                    }
                    if (student.getProvinsi() != null) {
                        int spinnerPosition = provinsiAdapter.getPosition(student.getProvinsi());
                        binding.provinsiortu.setSelection(spinnerPosition);
                    }

                }else{
                    binding.alamatorangtua.setText("");
                    binding.alamatorturt.setText("");
                    binding.alamatorturw.setText("");
                    binding.kodeposortu.setText("");
                }
            }
        });

        binding.btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                student.setNamaAyah(binding.namaayah.getText().toString());
                student.setNamaIbu(binding.namaibu.getText().toString());
                student.setNIKAyah(binding.nikayah.getText().toString());
                student.setNIKIbu(binding.nikibu.getText().toString());
                student.setTahunAyah(binding.lahirayah.getText().toString());
                student.setTahunIbu(binding.lahiribu.getText().toString());
                student.setNoOrtu(binding.telportu.getText().toString());
                student.setEmailOrtu(binding.emailortu.getText().toString());
                student.setPendidikanAyah(binding.pendidikanayah.getText().toString());
                student.setPendidikanIbu(binding.pendidikanibu.getText().toString());
                student.setPekerjaanAyah(binding.pekerjaanayah.getText().toString());
                student.setPekerjaanIbu(binding.pekerjaanibu.getText().toString());
                student.setAlamatOrtu(binding.alamatorangtua.getText().toString());
                student.setRTOrtu(binding.alamatorturt.getText().toString());
                student.setRWOrtu(binding.alamatorturw.getText().toString());
                student.setProvinsiOrtu(binding.provinsiortu.getSelectedItem().toString());
                student.setKota(binding.kotaortu.getSelectedItem().toString());
                student.setKode(binding.kodeposortu.getText().toString());

                SchoolForm school = new SchoolForm();
                school.setArguments(bundle);

                Navigation.findNavController(v).navigate(R.id.action_parentForm_to_schoolForm, bundle);
            }
        });

        return binding.getRoot();
    }
}