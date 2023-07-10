/**
* transform: true
* defaultShowCode: true
* background: 'rgb(204,204,204, .33)'
* padding: 20px
*/
import React from 'react';
import SchemaBuilder from '@xrenders/schema-builder';
import Generator from 'fr-generator';
import { PageContainer } from '@ant-design/pro-layout';
import styles from './index.less';

const defaultValue = {
  type: 'object',
  properties: {
    inputName: {
      title: '简单输入框',
      type: 'string',
    },
  },
};
const FormDesign = () => {
  return (
  <PageContainer>
    <div className={styles.editor} style={{height: '80vh' }}>
      <SchemaBuilder defaultValue={defaultValue} importBtn={true} exportBtn={true} pubBtn={false}/>
    </div>
    </PageContainer>
  );
};

export default FormDesign;