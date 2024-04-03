package com.example.myapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder>{
    private ArrayList<Books> listBook;
    private Context context;

    public BookAdapter(ArrayList<Books> listBook, Context context) {
        this.listBook = listBook;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View bookView = inflater.inflate(R.layout.booklist, parent, false);
        ViewHolder viewHolder = new ViewHolder(bookView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Books book = listBook.get(position);
        Picasso.get().load(book.getImage()).into(holder.imageView);
        holder.tvPrice.setText(convertToVND(book.getPrice()));
        holder.tvStar.setText(String.valueOf(book.getStar()));
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    public static String convertToVND(double price) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        Currency currency = Currency.getInstance(new Locale("vi", "VN"));
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        numberFormat.setCurrency(currency);
        return numberFormat.format(price);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvPrice;
        TextView tvStar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_book);
            tvPrice = itemView.findViewById(R.id.book_price);
            tvStar = itemView.findViewById(R.id.book_star);
        }
    }
}
