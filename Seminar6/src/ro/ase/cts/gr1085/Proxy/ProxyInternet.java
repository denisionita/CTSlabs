package ro.ase.cts.gr1085.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private List<String> blackList = new ArrayList<>();
    private ProviderInternet provider = new ProviderInternet();

    public ProxyInternet(){
        addToBL("abc.com");
    }

    public void addToBL(String url){
        blackList.add(url);
    }

    public void removeFromBL(String url){
        blackList.remove(url);
    }

    @Override
    public void connectTo(String url) {
        if(blackList.contains(url)){
            System.out.println("Pagina web nu se poate afisa");
        }else{
            provider.connectTo(url);
        }
    }
}
