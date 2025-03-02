package com.example.kt23.service;

import com.example.kt23.model.Sach;

import java.util.ArrayList;
import java.util.List;

public class SachService {
    List<Sach> listSach = new ArrayList<>();
    public List<Sach> getListSach() {
        return listSach;

    }
    public Sach getOne(String tenSach) {
        for (Sach sach : listSach) {
            if (sach.getTenSach() == tenSach) {
                return sach;
            }
        }
        return null;
    }

    public void add(Sach sach) {
        listSach.add(sach);
    }
    public void UpdateSach(Sach sach ) {
for (Sach sach1 : listSach) {
    if (sach1.getMaSach() == sach.getMaSach()) {
        throw new IllegalArgumentException();
    }
}
        int index = -1;
        for (int i = 0; i < listSach.size(); i++) {
            if (listSach.get(i).getTenSach() == sach.getTenSach()){
                index  = i;
            }
        }
        listSach.set(index, sach);

    }
}
