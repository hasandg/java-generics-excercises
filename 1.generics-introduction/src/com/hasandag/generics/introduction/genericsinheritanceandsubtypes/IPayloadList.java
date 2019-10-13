package com.hasandag.generics.introduction.genericsinheritanceandsubtypes;

import java.util.List;

public interface IPayloadList<E,P> extends List<E> {
    void setPayload(int index, P val);

}
