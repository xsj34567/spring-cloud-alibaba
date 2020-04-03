/*
 * Copyright (C) 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.alicloud.context.sms;

import com.alibaba.alicloud.context.BaseAliCloudSpringApplication;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author xiaolongzuo
 */
public class SmsPropertiesDefaultTests extends BaseAliCloudSpringApplication {

	@Autowired
	private SmsProperties smsProperties;

	@Test
	public void test() {
		assertThat(smsProperties.getReportQueueName()).isNull();
		assertThat(smsProperties.getUpQueueName()).isNull();
		assertThat(smsProperties.getConnectTimeout()).isEqualTo("10000");
		assertThat(smsProperties.getReadTimeout()).isEqualTo("10000");
	}
}
