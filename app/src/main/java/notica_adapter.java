
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NoticiaAdapter extends RecyclerView.Adapter<NoticiaAdapter.NoticiaViewHolder> {

    private List<NoticiaAdapter> listaNoticias;

    public NoticiaAdapter(List<NoticiaAdapter> listaNoticias) {
        this.listaNoticias = listaNoticias;
    }

    @NonNull
    @Override
    public NoticiaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.noticia_item, parent, false);
        return new NoticiaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticiaViewHolder holder, int position) {
        Noticia noticia = listaNoticias.get(position);
        holder.txtTitulo.setText(noticia.getTitulo());
        holder.txtDescripcion.setText(noticia.getDescripcion());
        holder.imgNoticia.setImageResource(noticia.getImagenId());
    }

    @Override
    public int getItemCount() {
        return listaNoticias.size();
    }

    public static class NoticiaViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitulo, txtDescripcion;
        ImageView imgNoticia;

        public NoticiaViewHolder(View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            imgNoticia = itemView.findViewById(R.id.imgNoticia);
        }
    }
}

