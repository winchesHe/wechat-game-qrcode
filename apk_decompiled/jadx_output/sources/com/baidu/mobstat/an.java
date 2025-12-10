package com.baidu.mobstat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class an {
    private a a;
    private Map<String, am> b = new HashMap();

    public interface a {
        List<am> a();
    }

    public an(a aVar) {
        this.a = aVar;
        for (am amVar : aVar.a()) {
            this.b.put(amVar.a(), amVar);
        }
    }

    public am a(String str) {
        return this.b.get(str);
    }

    public List<am> a() {
        return new ArrayList(this.b.values());
    }
}
