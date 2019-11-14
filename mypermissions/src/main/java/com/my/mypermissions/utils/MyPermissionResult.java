package com.my.mypermissions.utils;

import java.util.List;

public class MyPermissionResult {
    private boolean granted;
    private List<String> deniedPermissions;

    public MyPermissionResult(List<String> deniedPermissions) {
        this.granted = ObjectUtils.isEmpty(deniedPermissions);
        this.deniedPermissions = deniedPermissions;
    }

    public boolean isGranted() {
        return granted;
    }

    public List<String> getDeniedPermissions() {
        return deniedPermissions;
    }
}
