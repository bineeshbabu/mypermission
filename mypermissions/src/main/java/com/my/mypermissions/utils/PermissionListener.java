package com.my.mypermissions.utils;

import java.util.List;

public interface PermissionListener {
    void onPermissionGranted();

    void onPermissionDenied(List<String> deniedPermissions);
}
