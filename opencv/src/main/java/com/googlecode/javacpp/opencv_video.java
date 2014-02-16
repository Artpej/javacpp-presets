/* DO NOT EDIT THIS FILE - IT IS MACHINE GENERATED */

package com.googlecode.javacpp;

import com.googlecode.javacpp.*;
import com.googlecode.javacpp.annotation.*;
import java.nio.*;

import static com.googlecode.javacpp.opencv_core.*;
import static com.googlecode.javacpp.opencv_imgproc.*;

public class opencv_video extends com.googlecode.javacpp.presets.opencv_video {
    static { Loader.load(); }

/* Wrapper for header file /usr/local/include/opencv2/video/tracking.hpp */

/** \file tracking.hpp
 \brief The Object and Feature Tracking
 */

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_TRACKING_HPP__
// #define __OPENCV_TRACKING_HPP__

// #include "opencv2/core/core.hpp"
// #include "opencv2/imgproc/imgproc.hpp"

// #ifdef __cplusplus
// #endif

/****************************************************************************************\
*                                  Motion Analysis                                       *
\****************************************************************************************/

/************************************ optical flow ***************************************/

public static final int CV_LKFLOW_PYR_A_READY =       1;
public static final int CV_LKFLOW_PYR_B_READY =       2;
public static final int CV_LKFLOW_INITIAL_GUESSES =   4;
public static final int CV_LKFLOW_GET_MIN_EIGENVALS = 8;

/* It is Lucas & Kanade method, modified to use pyramids.
   Also it does several iterations to get optical flow for
   every point at every pyramid level.
   Calculates optical flow between two images for certain set of points (i.e.
   it is a "sparse" optical flow, which is opposite to the previous 3 methods) */
public static native void cvCalcOpticalFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                     CvArr prev_pyr, CvArr curr_pyr,
                                     @Const CvPoint2D32f prev_features,
                                     CvPoint2D32f curr_features,
                                     int count,
                                     @ByVal CvSize win_size,
                                     int level,
                                     @Cast("char*") BytePointer status,
                                     FloatPointer track_error,
                                     @ByVal CvTermCriteria criteria,
                                     int flags );
public static native void cvCalcOpticalFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                     CvArr prev_pyr, CvArr curr_pyr,
                                     @Const CvPoint2D32f prev_features,
                                     CvPoint2D32f curr_features,
                                     int count,
                                     @ByVal CvSize win_size,
                                     int level,
                                     @Cast("char*") ByteBuffer status,
                                     FloatBuffer track_error,
                                     @ByVal CvTermCriteria criteria,
                                     int flags );
public static native void cvCalcOpticalFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                     CvArr prev_pyr, CvArr curr_pyr,
                                     @Const CvPoint2D32f prev_features,
                                     CvPoint2D32f curr_features,
                                     int count,
                                     @ByVal CvSize win_size,
                                     int level,
                                     @Cast("char*") byte[] status,
                                     float[] track_error,
                                     @ByVal CvTermCriteria criteria,
                                     int flags );


/* Modification of a previous sparse optical flow algorithm to calculate
   affine flow */
public static native void cvCalcAffineFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                    CvArr prev_pyr, CvArr curr_pyr,
                                    @Const CvPoint2D32f prev_features,
                                    CvPoint2D32f curr_features,
                                    FloatPointer matrices, int count,
                                    @ByVal CvSize win_size, int level,
                                    @Cast("char*") BytePointer status, FloatPointer track_error,
                                    @ByVal CvTermCriteria criteria, int flags );
public static native void cvCalcAffineFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                    CvArr prev_pyr, CvArr curr_pyr,
                                    @Const CvPoint2D32f prev_features,
                                    CvPoint2D32f curr_features,
                                    FloatBuffer matrices, int count,
                                    @ByVal CvSize win_size, int level,
                                    @Cast("char*") ByteBuffer status, FloatBuffer track_error,
                                    @ByVal CvTermCriteria criteria, int flags );
public static native void cvCalcAffineFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                    CvArr prev_pyr, CvArr curr_pyr,
                                    @Const CvPoint2D32f prev_features,
                                    CvPoint2D32f curr_features,
                                    float[] matrices, int count,
                                    @ByVal CvSize win_size, int level,
                                    @Cast("char*") byte[] status, float[] track_error,
                                    @ByVal CvTermCriteria criteria, int flags );

/* Estimate rigid transformation between 2 images or 2 point sets */
public static native int cvEstimateRigidTransform( @Const CvArr A, @Const CvArr B,
                                      CvMat M, int full_affine );

/* Estimate optical flow for each pixel using the two-frame G. Farneback algorithm */
public static native void cvCalcOpticalFlowFarneback( @Const CvArr prev, @Const CvArr next,
                                        CvArr flow, double pyr_scale, int levels,
                                        int winsize, int iterations, int poly_n,
                                        double poly_sigma, int flags );

/********************************* motion templates *************************************/

/****************************************************************************************\
*        All the motion template functions work only with single channel images.         *
*        Silhouette image must have depth IPL_DEPTH_8U or IPL_DEPTH_8S                   *
*        Motion history image must have depth IPL_DEPTH_32F,                             *
*        Gradient mask - IPL_DEPTH_8U or IPL_DEPTH_8S,                                   *
*        Motion orientation image - IPL_DEPTH_32F                                        *
*        Segmentation mask - IPL_DEPTH_32F                                               *
*        All the angles are in degrees, all the times are in milliseconds                *
\****************************************************************************************/

/* Updates motion history image given motion silhouette */
public static native void cvUpdateMotionHistory( @Const CvArr silhouette, CvArr mhi,
                                      double timestamp, double duration );

/* Calculates gradient of the motion history image and fills
   a mask indicating where the gradient is valid */
public static native void cvCalcMotionGradient( @Const CvArr mhi, CvArr mask, CvArr orientation,
                                     double delta1, double delta2,
                                     int aperture_size/*CV_DEFAULT(3)*/);

/* Calculates average motion direction within a selected motion region
   (region can be selected by setting ROIs and/or by composing a valid gradient mask
   with the region mask) */
public static native double cvCalcGlobalOrientation( @Const CvArr orientation, @Const CvArr mask,
                                        @Const CvArr mhi, double timestamp,
                                        double duration );

/* Splits a motion history image into a few parts corresponding to separate independent motions
   (e.g. left hand, right hand) */
public static native CvSeq cvSegmentMotion( @Const CvArr mhi, CvArr seg_mask,
                                CvMemStorage storage,
                                double timestamp, double seg_thresh );

/****************************************************************************************\
*                                       Tracking                                         *
\****************************************************************************************/

/* Implements CAMSHIFT algorithm - determines object position, size and orientation
   from the object histogram back project (extension of meanshift) */
public static native int cvCamShift( @Const CvArr prob_image, @ByVal CvRect window,
                        @ByVal CvTermCriteria criteria, CvConnectedComp comp,
                        CvBox2D box/*CV_DEFAULT(NULL)*/ );

/* Implements MeanShift algorithm - determines object position
   from the object histogram back project */
public static native int cvMeanShift( @Const CvArr prob_image, @ByVal CvRect window,
                         @ByVal CvTermCriteria criteria, CvConnectedComp comp );

/*
standard Kalman filter (in G. Welch' and G. Bishop's notation):

  x(k)=A*x(k-1)+B*u(k)+w(k)  p(w)~N(0,Q)
  z(k)=H*x(k)+v(k),   p(v)~N(0,R)
*/
public static class CvKalman extends Pointer {
    static { Loader.load(); }
    public CvKalman() { allocate(); }
    public CvKalman(int size) { allocateArray(size); }
    public CvKalman(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvKalman position(int position) {
        return (CvKalman)super.position(position);
    }

    public native int MP(); public native CvKalman MP(int MP);                     /* number of measurement vector dimensions */
    public native int DP(); public native CvKalman DP(int DP);                     /* number of state vector dimensions */
    public native int CP(); public native CvKalman CP(int CP);                     /* number of control vector dimensions */

    /* backward compatibility fields */
// #if 1
    public native FloatPointer PosterState(); public native CvKalman PosterState(FloatPointer PosterState);         /* =state_pre->data.fl */
    public native FloatPointer PriorState(); public native CvKalman PriorState(FloatPointer PriorState);          /* =state_post->data.fl */
    public native FloatPointer DynamMatr(); public native CvKalman DynamMatr(FloatPointer DynamMatr);           /* =transition_matrix->data.fl */
    public native FloatPointer MeasurementMatr(); public native CvKalman MeasurementMatr(FloatPointer MeasurementMatr);     /* =measurement_matrix->data.fl */
    public native FloatPointer MNCovariance(); public native CvKalman MNCovariance(FloatPointer MNCovariance);        /* =measurement_noise_cov->data.fl */
    public native FloatPointer PNCovariance(); public native CvKalman PNCovariance(FloatPointer PNCovariance);        /* =process_noise_cov->data.fl */
    public native FloatPointer KalmGainMatr(); public native CvKalman KalmGainMatr(FloatPointer KalmGainMatr);        /* =gain->data.fl */
    public native FloatPointer PriorErrorCovariance(); public native CvKalman PriorErrorCovariance(FloatPointer PriorErrorCovariance);/* =error_cov_pre->data.fl */
    public native FloatPointer PosterErrorCovariance(); public native CvKalman PosterErrorCovariance(FloatPointer PosterErrorCovariance);/* =error_cov_post->data.fl */
    public native FloatPointer Temp1(); public native CvKalman Temp1(FloatPointer Temp1);               /* temp1->data.fl */
    public native FloatPointer Temp2(); public native CvKalman Temp2(FloatPointer Temp2);               /* temp2->data.fl */
// #endif

    public native CvMat state_pre(); public native CvKalman state_pre(CvMat state_pre);           /* predicted state (x'(k)):
                                    x(k)=A*x(k-1)+B*u(k) */
    public native CvMat state_post(); public native CvKalman state_post(CvMat state_post);          /* corrected state (x(k)):
                                    x(k)=x'(k)+K(k)*(z(k)-H*x'(k)) */
    public native CvMat transition_matrix(); public native CvKalman transition_matrix(CvMat transition_matrix);   /* state transition matrix (A) */
    public native CvMat control_matrix(); public native CvKalman control_matrix(CvMat control_matrix);      /* control matrix (B)
                                   (it is not used if there is no control)*/
    public native CvMat measurement_matrix(); public native CvKalman measurement_matrix(CvMat measurement_matrix);  /* measurement matrix (H) */
    public native CvMat process_noise_cov(); public native CvKalman process_noise_cov(CvMat process_noise_cov);   /* process noise covariance matrix (Q) */
    public native CvMat measurement_noise_cov(); public native CvKalman measurement_noise_cov(CvMat measurement_noise_cov); /* measurement noise covariance matrix (R) */
    public native CvMat error_cov_pre(); public native CvKalman error_cov_pre(CvMat error_cov_pre);       /* priori error estimate covariance matrix (P'(k)):
                                    P'(k)=A*P(k-1)*At + Q)*/
    public native CvMat gain(); public native CvKalman gain(CvMat gain);                /* Kalman gain matrix (K(k)):
                                    K(k)=P'(k)*Ht*inv(H*P'(k)*Ht+R)*/
    public native CvMat error_cov_post(); public native CvKalman error_cov_post(CvMat error_cov_post);      /* posteriori error estimate covariance matrix (P(k)):
                                    P(k)=(I-K(k)*H)*P'(k) */
    public native CvMat temp1(); public native CvKalman temp1(CvMat temp1);               /* temporary matrices */
    public native CvMat temp2(); public native CvKalman temp2(CvMat temp2);
    public native CvMat temp3(); public native CvKalman temp3(CvMat temp3);
    public native CvMat temp4(); public native CvKalman temp4(CvMat temp4);
    public native CvMat temp5(); public native CvKalman temp5(CvMat temp5);
}

/* Creates Kalman filter and sets A, B, Q, R and state to some initial values */
public static native CvKalman cvCreateKalman( int dynam_params, int measure_params,
                                 int control_params/*CV_DEFAULT(0)*/);

/* Releases Kalman filter state */
public static native void cvReleaseKalman( @Cast("CvKalman**") PointerPointer kalman);
public static native void cvReleaseKalman( @ByPtrPtr CvKalman kalman);

/* Updates Kalman filter by time (predicts future state of the system) */
public static native @Const CvMat cvKalmanPredict( CvKalman kalman,
                                      @Const CvMat control/*CV_DEFAULT(NULL)*/);

/* Updates Kalman filter by measurement
   (corrects state of the system and internal matrices) */
public static native @Const CvMat cvKalmanCorrect( CvKalman kalman, @Const CvMat measurement );

public static native @Const CvMat cvKalmanUpdateByTime(CvKalman arg1, CvMat arg2);
public static native @Const CvMat cvKalmanUpdateByMeasurement(CvKalman arg1, CvMat arg2);

// #ifdef __cplusplus

// #endif

// #endif


}