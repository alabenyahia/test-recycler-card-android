package com.pickurapps.recyclerpluscardtryout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> mBookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBookList = new ArrayList<>();
        mBookList.add(new Book("The Vegiterian", "Book Categorie", "Book Description", R.drawable.thevegeterian));
        mBookList.add(new Book("He Died With", "Book Categorie", "Book Description", R.drawable.hediedwith));
        mBookList.add(new Book("Maria Samples", "Book Categorie", "Book Description", R.drawable.mariasemples));
        mBookList.add(new Book("The Martian", "Book Categorie", "Book Description", R.drawable.themartian));
        mBookList.add(new Book("The Wild Robot", "Book Categorie", "Book Description", R.drawable.thewildrobot));
        mBookList.add(new Book("The Vegiterian", "Book Categorie", "Book Description", R.drawable.thevegeterian));
        mBookList.add(new Book("He Died With", "Book Categorie", "Book Description", R.drawable.hediedwith));
        mBookList.add(new Book("Maria Samples", "Book Categorie", "Book Description", R.drawable.mariasemples));
        mBookList.add(new Book("The Martian", "Book Categorie", "Book Description", R.drawable.themartian));
        mBookList.add(new Book("The Wild Robot", "Book Categorie", "Book Description", R.drawable.thewildrobot));        mBookList.add(new Book("The Vegiterian", "Book Categorie", "Book Description", R.drawable.thevegeterian));
        mBookList.add(new Book("He Died With", "Book Categorie", "Book Description", R.drawable.hediedwith));
        mBookList.add(new Book("Maria Samples", "Book Categorie", "Book Description", R.drawable.mariasemples));
        mBookList.add(new Book("The Martian", "Book Categorie", "Book Description", R.drawable.themartian));
        mBookList.add(new Book("The Wild Robot", "Book Categorie", "Book Description", R.drawable.thewildrobot));

        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, mBookList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
