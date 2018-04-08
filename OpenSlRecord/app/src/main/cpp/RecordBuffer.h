//
// Created by ywl on 2018/3/27.
//

#ifndef OPENSLRECORD_RECORDBUFFER_H
#define OPENSLRECORD_RECORDBUFFER_H


class RecordBuffer {

public:
    short **buffer;
    int index = -1;
public:
    RecordBuffer(int buffersize);
    ~RecordBuffer();
    /**
     * 得到一个新的录制buffer
     * @return
     */
    short* getRecordBuffer();
    /**
     * 得到当前录制buffer
     * @return
     */
    short* getNowBuffer();
};


#endif //OPENSLRECORD_RECORDBUFFER_H
