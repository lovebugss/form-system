import React from 'react';
import {PageContainer} from '@ant-design/pro-layout';
import {Card, Tabs} from 'antd';
import type { TabsProps } from 'antd';
import {Content} from "antd/es/layout/layout";

const Question: React.FC<Record<string, any>> = ()=>{

  return(
    <Content>
      1111
    </Content>
  )
}

const Design: React.FC<Record<string, any>> = () => {
  const items: TabsProps['items'] = [
    {
      key: '1',
      label: `问题`,
      children: <Question/>,
    },
    {
      key: '2',
      label: `设置`,
      children: `Content of Tab Pane 2`,
    },
  ];
  return (

    <PageContainer content={"设计表单"}>
      <Tabs
        defaultActiveKey="1"
        type="card"
        items={items}
      />
      </PageContainer>
  )
}
export default Design;
