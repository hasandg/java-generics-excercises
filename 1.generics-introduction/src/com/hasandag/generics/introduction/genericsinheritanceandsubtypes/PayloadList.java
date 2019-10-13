package com.hasandag.generics.introduction.genericsinheritanceandsubtypes;

import java.util.ArrayList;

public class PayloadList extends ArrayList implements IPayloadList  {
    @Override
    public void setPayload(int index, Object val) {

    }
}
