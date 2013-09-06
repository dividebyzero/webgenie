#include <jni.h>
#include "com_cookbook_webgenie_webwrapper_CakePan.h"
#include "picalc.h"

JNIEXPORT jdouble JNICALL Java_com_cookbook_webgenie_webwrapper_CakePan_nBakePi
  (JNIEnv *, jobject)
{

	PiCalc* pPiCalc = new PiCalc();

	float pi = pPiCalc->computePi();

	pPiCalc = 0;
	return (jdouble)pi;
}
