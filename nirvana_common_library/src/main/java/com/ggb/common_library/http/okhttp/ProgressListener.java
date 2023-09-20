package com.ggb.common_library.http.okhttp;

public interface ProgressListener {
    void update(String url, long bytesRead, long contentLength, boolean done);
}