package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Item item;
    private ArrayList<Item> listItems;
    private ItemAdapter mitemAddapter;

    private ArrayList<Books> books;
    private BookAdapter bookAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
//        listItems = new ArrayList<>();
//        data();
//        mitemAddapter = new ItemAdapter(listItems, this);
//        recyclerView.setAdapter(mitemAddapter);

        books = new ArrayList<>();
        bookData();

        bookAdapter = new BookAdapter(books, this);
        recyclerView.setAdapter(bookAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void bookData() {
        books.add(new Books("https://animecorner.me/wp-content/uploads/2021/08/yuistory.png", 105000.0, 4.5));
        books.add(new Books("https://i.pinimg.com/originals/8b/83/18/8b831869ab46681f1d381c8d93408dcc.png", 290000.0, 4.5));
        books.add(new Books("https://i.pinimg.com/originals/67/2f/ad/672fadd2b0ec3f2ddae51ec841f9f72b.jpg", 200000.0, 5.0));
        books.add(new Books("https://i.pinimg.com/originals/22/f6/ff/22f6ffd37bad55f7511ef4e880689782.png", 125000.0, 4.6));
        books.add(new Books("https://2.bp.blogspot.com/-kKEKPNoRdRI/WP6n3uhk8oI/AAAAAAAAfGY/LG0h0o8OhmkcEN7KuOTIqrBlGAEDxWskwCLcB/s1600/oregairu_v11_001.png", 112000.5, 4.9));
        books.add(new Books("https://i.pinimg.com/originals/da/20/d5/da20d566696314b886cd5829107682d5.png", 235000.0, 4.5));
        books.add(new Books("https://cdn.kyou.id/items/54369-light-novel-yahari-ore-no-seishun-love-comedy-wa-machigatteiru-anthology-vol-1-yukino-side.jpg", 125000.0, 4.5));
        books.add(new Books("https://1.bp.blogspot.com/-R_uCnZyAwvs/X3HwjQpUgQI/AAAAAAAAAG0/8yodEpx1pykT9FaXFBnxtqI1mhUo4QEewCNcBGAsYHQ/s680/EVpXUBHXgAA3n8s.jpg", 105000.0, 4.5));
    }
    private void data() {
        listItems.add(new Item("Yui Starting 1", "https://animecorner.me/wp-content/uploads/2021/08/yuistory.png"));
        listItems.add(new Item("Oregairu 10.5", "https://i.pinimg.com/originals/8b/83/18/8b831869ab46681f1d381c8d93408dcc.png"));
        listItems.add(new Item("Oregairu 1", "https://i.pinimg.com/originals/67/2f/ad/672fadd2b0ec3f2ddae51ec841f9f72b.jpg"));
        listItems.add(new Item("Oregairu 8", "https://i.pinimg.com/originals/22/f6/ff/22f6ffd37bad55f7511ef4e880689782.png"));
        listItems.add(new Item("Oregairu 11", "https://2.bp.blogspot.com/-kKEKPNoRdRI/WP6n3uhk8oI/AAAAAAAAfGY/LG0h0o8OhmkcEN7KuOTIqrBlGAEDxWskwCLcB/s1600/oregairu_v11_001.png"));
        listItems.add(new Item("Oregairu 8", "https://i.pinimg.com/originals/da/20/d5/da20d566696314b886cd5829107682d5.png"));
        listItems.add(new Item("Oregairu side Yukino ", "https://cdn.kyou.id/items/54369-light-novel-yahari-ore-no-seishun-love-comedy-wa-machigatteiru-anthology-vol-1-yukino-side.jpg"));
        listItems.add(new Item("Oregairu side Yui", "https://1.bp.blogspot.com/-R_uCnZyAwvs/X3HwjQpUgQI/AAAAAAAAAG0/8yodEpx1pykT9FaXFBnxtqI1mhUo4QEewCNcBGAsYHQ/s680/EVpXUBHXgAA3n8s.jpg"));

    }
}