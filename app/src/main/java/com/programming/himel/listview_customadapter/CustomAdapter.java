package com.programming.himel.listview_customadapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<BDPlayer> {
    Context mContext;
    int resource;
    List<BDPlayer> bdPlayerList;

    public CustomAdapter(@NonNull Context context, int resource
            , @NonNull List<BDPlayer> bdPlayers) {
        super(context, resource, bdPlayers);

        this.mContext = context;
        this.resource = resource;
        this.bdPlayerList = bdPlayers;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView
            , @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mContext);

        View view = inflater.inflate(resource,null);

        TextView name = view.findViewById(R.id.name_tv);
        TextView description = view.findViewById(R.id.description_text_id);
        ImageView image = view.findViewById(R.id.item_image_id);

        final BDPlayer bdPlayer = bdPlayerList.get(position);


        name.setText(bdPlayer.getName());
        description.setText(bdPlayer.getDescription());

        image.setImageDrawable(mContext.getResources()
                .getDrawable(bdPlayer.getImage()));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Selected Player Name Is : "
                        +bdPlayer.getName(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;



    }


}
