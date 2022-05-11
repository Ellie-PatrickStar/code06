package com.example.code06;

public class NewsAdapter extent ArrayAdapter<News> {
    private List<News> mNewsData;
    private Context mContext;
    private int resourceId;

    public NewsAdapter(Context context,int resourceId,List<News> data){
        super(context,resourceId,data);
        this.mContext=context;
        this.mNewsData=data;
        this.resourceId=resourceId;
        }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        news=getItem(position);
        view;

        view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        TxtView tvTitle=view.findViewById(R.id.tv_title);
        kTxtView tvAuthor=view.findViewById(R.id.tv_subtitle);
        ImageView ivImage=view.findViewById(R.id.iv_image);

        tvTitle.setText(news.getTitle());
        tvAuthor.setText(news.getAuthor());
        ivImage.setImageResource(news.getImageId());
        return view;
        }
    }
