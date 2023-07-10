/**
* transform: true
* defaultShowCode: true
* background: 'rgb(204,204,204, .33)'
* padding: 20px
*/
import React from 'react';
import { PageContainer } from '@ant-design/pro-layout';
import styles from './index.less';
import {DesignForm} from '@/components/DesignForm/core';

const FormDesign = () => {
  return (
  <PageContainer>
    <div className={styles.editor} style={{height: '80vh' }}>
      <DesignForm/>
    </div>
    </PageContainer>
  );
};

export default FormDesign;
