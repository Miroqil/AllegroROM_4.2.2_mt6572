// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.android.vcard;


// Referenced classes of package com.android.vcard:
//            VCardEntry

public interface VCardEntryHandler
{

    public abstract void onEnd();

    public abstract void onEntryCreated(VCardEntry vcardentry);

    public abstract void onStart();
}
