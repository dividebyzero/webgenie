#include "picalc.h"
#include<cmath>

using namespace std;

PiCalc::PiCalc()
{

}

PiCalc::~PiCalc()
{

}


double PiCalc::computePi()
{
	int n;
	double val = 0.0;
	double pi  = 0.0;

	for(n=1;n<=1000000;n++)
	{
		val=val+ ( powf(-1,n+1) / (2*n-1) );
	}
	pi=4*val;

	return pi;
}
