
LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := mypie
LOCAL_SRC_FILES := picalc.cpp
LOCAL_SRC_FILES += com_cookbook_webgenie_webwrapper_CakePan.cpp

include $(BUILD_SHARED_LIBRARY)


