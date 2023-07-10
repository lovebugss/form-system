// @ts-ignore
/* eslint-disable */
// @ts-ignore
import {request} from 'umi';
import {MenuDataItem} from "@umijs/route-utils";

export async function menuData(params:Record<string, any>, options?: { [key: string]: any },) {
  return request<MenuDataItem>("/api/menu/list", {
    method: "post",
    ...params,
    ...(options || {})
  })
}
