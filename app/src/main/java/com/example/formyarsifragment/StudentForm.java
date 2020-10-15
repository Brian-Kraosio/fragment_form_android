package com.example.formyarsifragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.DatePicker;

import com.example.formyarsifragment.databinding.FragmentStudentFormBinding;
import com.example.formyarsifragment.model.Student;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentForm#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentForm extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    DatePickerDialog picker;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StudentForm() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment studentForm.
     */
    // TODO: Rename and change types and number of parameters
    public static StudentForm newInstance(String param1, String param2) {
        StudentForm fragment = new StudentForm();
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
        final FragmentStudentFormBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_student_form, container, false);
        final Student student = new Student();

        binding.tanggallahir.setOnClickListener(new View.OnClickListener() {
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
                                binding.tanggallahir.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        binding.laki.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    student.setJeniskelamin("Laki Laki");
                }
            }
        });

        binding.perempuan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    student.setJeniskelamin("Perempuan");
                }
            }
        });

        binding.btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                student.setNama(binding.name.getText().toString());
                student.setFakultas(binding.spinfakultas.getSelectedItem().toString());
                student.setProdi(binding.spinprodi.getSelectedItem().toString());
                student.setStatus(binding.status.getSelectedItem().toString());
                student.setPass(binding.password.getText().toString());
                student.setPassconfirm(binding.retypepassword.getText().toString());
                student.setAlasan(binding.alasandaftar.getText().toString());
                student.setNIK(binding.nik.getText().toString());
                student.setPrestasi(binding.prestasiakademik.getText().toString());
                student.setTanggallahir(binding.tanggallahir.getText().toString());
                student.setKewarganegaraan(binding.kewarganegaraan.getText().toString());
                student.setAgama(binding.agama.getSelectedItem().toString());
                student.setAlamat(binding.alamatsiswa.getText().toString());
                student.setRT(binding.alamatsiswart.getText().toString());
                student.setRW(binding.alamatsiswarw.getText().toString());
                student.setKode(binding.alamatsiswakodepos.getText().toString());
                student.setProvinsi(binding.provinsi.getSelectedItem().toString());
                student.setKota(binding.kota.getSelectedItem().toString());
                student.setNoHp(binding.telefonsiswa.getText().toString());
                student.setEmail(binding.email.getText().toString());

                bundle.putParcelable("student", student);

                ParentForm parent = new ParentForm();
                parent.setArguments(bundle);


                Navigation.findNavController(v).navigate(R.id.action_studentForm_to_parentForm,bundle);
            }
        });

        return binding.getRoot();
    }

}