package io.delasoft.joshapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.delasoft.joshapp.Model.NameUssd;
import io.delasoft.joshapp.R;

public class ViewUssdAdapter2 extends RecyclerView.Adapter<ViewUssdAdapter2.ViewRentAdadpterViewHolder> {

    private Context mcontext;
    private List<NameUssd> muploads;

    private OnItemClickListener mListener;

    public ViewUssdAdapter2(Context context, List<NameUssd> uploads) {

        this.mcontext = context;
        this.muploads = uploads;
    }

    @NonNull
    @Override
    public ViewRentAdadpterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ussd, parent, false);

        return new ViewRentAdadpterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRentAdadpterViewHolder holder, int position) {

        NameUssd uploadCurrent = muploads.get(position);

        if (uploadCurrent !=null) {
            holder.TV_shortcode.setText("*348#");
            holder.TV_namecode.setText(uploadCurrent.getName());

        }


    }


    @Override
    public int getItemCount() {
        return muploads.size();
    }

    public class ViewRentAdadpterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView TV_shortcode,TV_category,TV_namecode;

        public ViewRentAdadpterViewHolder(@NonNull View itemView) {

            super(itemView);
            TV_shortcode=itemView.findViewById(R.id.TV_shortcode);
            TV_category=itemView.findViewById(R.id.TV_category);
            TV_namecode=itemView.findViewById(R.id.TV_namecode);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (mListener != null){
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    mListener.onItemClick(position);
                }
            }

        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;

    }



}
