// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.google.common.io;

import java.io.IOException;

public interface ByteProcessor
{

    public abstract Object getResult();

    public abstract boolean processBytes(byte abyte0[], int i, int j)
        throws IOException;
}
