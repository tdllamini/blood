# Software Requirements Specification (IEEE 830 Format)
# BloodCare Management System

## 1. Introduction

### 1.1 Purpose
This document specifies the requirements for the Blood Bank Management System (BBMS). It defines the functional and non-functional requirements for a software application designed to manage blood donations, inventory, appointments, and requests for blood bank operations.

### 1.2 Scope
The Blood Bank Management System shall provide a comprehensive solution for managing donor registrations, appointment scheduling, blood inventory tracking, laboratory testing, blood requests from hospitals, reporting and more. The system supports multiple user roles (ADMIN, STAFF, DONOR) with role-based access control.

### 1.3 Definitions, Acronyms, and Abbreviations
| Term | Definition |
|------|------------|
| ADMIN | System administrator with full access rights |
| STAFF | Blood bank staff member with operational access |
| DONOR | Registered blood donor with limited self-service access |
| ABO | Blood group antigen system (A, B, AB, O) |
| Rh | Rhesus factor (positive or negative) |
| HIV | Human Immunodeficiency Virus |
| HBV | Hepatitis B Virus |
| HCV | Hepatitis C Virus |

### 1.4 References
- IEEE Std 830-1998: Software Requirements Specification
- REPOSITORY: https://github.com/tdllamini/blood-system

### 1.5 Overview
The remainder of this document presents overall system description in Section 2, followed by specific requirements in Section 3.

## 2. Overall Description

### 2.1 Product Perspective
The Blood Bank Management System is a standalone application that operates independently. It uses a relational database for persistence and provides a desktop/web interface for users.

### 2.2 Product Functions
The system provides the following major functions:
- User authentication and role-based access control
- Donor registration and profile management
- Appointment scheduling and management
- Blood inventory tracking with expiry management
- Blood collection processing and laboratory testing
- Hospital blood requests and issuance tracking
- Donation campaign management
- Reporting and analytics
- Quality control and compliance tracking

### 2.3 User Characteristics
- **ADMIN**: Manages system configuration, users, and campaigns
- **STAFF**: Performs daily operations including donor management, blood processing, and request fulfillment
- **DONOR**: Self-registers, books appointments, and views personal donation history

### 2.4 Constraints
- System shall run on Windows 10+ and Linux distributions
- Database support limited to MSSQL Server and MySQL
- Deployment via Docker with docker-compose required

### 2.5 Assumptions and Dependencies
- Users have basic computer literacy
- Network connectivity for database access
- Barcode scanner available for blood bag identification
- Printer available for reports and labels

### 2.6 Apportioning of Requirements
All requirements in this document are to be implemented in the initial release. Future enhancements may include SMS notifications and mobile app integration.

## 3. Specific Requirements

### 3.1 External Interfaces

#### 3.1.1 User Interfaces
The system shall provide a graphical user interface accessible via web browser with minimum screen resolution of 1024x768.

#### 3.1.2 Database Interfaces
The system shall support MSSQL Server and MySQL databases with encrypted connections. Connection parameters shall be configurable.

#### 3.1.3 Communications Interfaces
All data transmission shall use TLS encryption. API endpoints shall use JSON format.

### 3.2 Functional Requirements

#### 3.2.1 User Authentication (FR-1)
| ID | Requirement |
|----|-------------|
| FR-1.1 | The system shall authenticate users via username and password |
| FR-1.2 | The system shall support three user roles: ADMIN, STAFF, DONOR |
| FR-1.3 | The system shall enforce role-based access control for all system features |
| FR-1.4 | The system shall provide password hashing for stored credentials |
| FR-1.5 | The system shall implement session timeout after 30 minutes of inactivity |

#### 3.2.2 Donor Management (FR-2)
| ID | Requirement |
|----|-------------|
| FR-2.1 | The system shall allow donors to register with personal details (name, contact, DOB, blood type) |
| FR-2.2 | The system shall allow donors to view and edit their profile |
| FR-2.3 | The system shall allow staff to search donors by blood type, name, or contact |
| FR-2.4 | The system shall track donor eligibility based on screening results |
| FR-2.5 | The system shall record total donation count per donor |

#### 3.2.3 Appointment Management (FR-3)
| ID | Requirement |
|----|-------------|
| FR-3.1 | The system shall allow donors to book appointments for donation |
| FR-3.2 | The system shall allow staff to schedule appointments on behalf of donors |
| FR-3.3 | The system shall prevent donors from scheduling if ineligible |
| FR-3.4 | The system shall track appointment status (SCHEDULED, COMPLETED, CANCELLED) |
| FR-3.5 | The system shall associate appointments with campaigns |

#### 3.2.4 Blood Inventory Management (FR-4)
| ID | Requirement |
|----|-------------|
| FR-4.1 | The system shall track blood units by type (A+, A-, B+, B-, AB+, AB-, O+, O-) |
| FR-4.2 | The system shall record expiry dates for each blood unit |
| FR-4.3 | The system shall mark units as usable/unusable based on test results |
| FR-4.4 | The system shall alert when inventory falls below threshold |
| FR-4.5 | The system shall track inventory across multiple locations |

#### 3.2.5 Blood Processing (FR-5)
| ID | Requirement |
|----|-------------|
| FR-5.1 | The system shall record donor screening data (hemoglobin, weight, temperature, blood pressure, pulse) |
| FR-5.2 | The system shall support screening deferral with reasons |
| FR-5.3 | The system shall record blood collection with unit numbers and bag IDs |
| FR-5.4 | The system shall track collection through testing and quarantine phases |
| FR-5.5 | The system shall record laboratory test results (ABO, Rh, HIV, HBV, HCV, Syphilis) |

#### 3.2.6 Blood Requests and Issuing (FR-6)
| ID | Requirement |
|----|-------------|
| FR-6.1 | The system shall allow hospitals to request blood units |
| FR-6.2 | The system shall track request urgency levels (ROUTINE, URGENT, EMERGENCY) |
| FR-6.3 | The system shall match requests to available compatible units |
| FR-6.4 | The system shall record blood issuances to hospitals |
| FR-6.5 | The system shall track transfusion records including adverse reactions |

#### 3.2.7 Campaign Management (FR-7)
| ID | Requirement |
|----|-------------|
| FR-7.1 | The system shall allow admins to create donation campaigns |
| FR-7.2 | The system shall track campaign dates, locations, and targets |
| FR-7.3 | The system shall count registered donors per campaign |
| FR-7.4 | The system shall mark campaigns as active/inactive |

#### 3.2.8 Reporting and Analytics (FR-8)
| ID | Requirement |
|----|-------------|
| FR-8.1 | The system shall generate reports on donor statistics |
| FR-8.2 | The system shall generate inventory level reports |
| FR-8.3 | The system shall generate campaign participation reports |
| FR-8.4 | The system shall generate screening and testing summaries |
| FR-8.5 | The system shall provide demand forecasting with 6-month predictions |
| FR-8.6 | The system shall recommend inventory restock actions and detect surplus stock |
| FR-8.7 | The system shall manage real-time donor queues for campaign sites |
| FR-8.8 | The system shall optimize appointment slot allocation with capacity tracking |
| FR-8.9 | The system shall calculate donor eligibility scores based on health screening data |

#### 3.2.9 Quality Control (FR-9)
| ID | Requirement |
|----|-------------|
| FR-9.1 | The system shall log equipment temperature checks |
| FR-9.2 | The system shall record training completion for staff |
| FR-9.3 | The system shall track certification expiry dates |

### 3.3 Non-Functional Requirements

#### 3.3.1 Performance Requirements (NFR-1)
| ID | Requirement |
|----|-------------|
| NFR-1.1 | System shall support minimum 50 concurrent users |
| NFR-1.2 | Page load time shall not exceed 3 seconds under normal load |
| NFR-1.3 | Database queries shall return results within 1 second for 95% of operations |

#### 3.3.2 Security Requirements (NFR-2)
| ID | Requirement |
|----|-------------|
| NFR-2.1 | All database connections shall use encrypted transmission |
| NFR-2.2 | Passwords shall be hashed using bcrypt or equivalent |
| NFR-2.3 | System shall implement input validation to prevent SQL injection |
| NFR-2.4 | System shall log all authentication attempts |
| NFR-2.5 | Sensitive operations shall require role-based authorization |

#### 3.3.3 Usability Requirements (NFR-3)
| ID | Requirement |
|----|-------------|
| NFR-3.1 | System shall provide intuitive navigation with max 3 clicks to reach any feature |
| NFR-3.2 | System shall display error messages in clear, actionable language |
| NFR-3.3 | System shall support screen resolution of 1024x768 minimum |

#### 3.3.4 Reliability Requirements (NFR-4)
| ID | Requirement |
|----|-------------|
| NFR-4.1 | System uptime shall be 99% during business hours |
| NFR-4.2 | Database backups shall be performed daily |
| NFR-4.3 | System shall handle database connection failures gracefully |

#### 3.3.5 Maintainability Requirements (NFR-5)
| ID | Requirement |
|----|-------------|
| NFR-5.1 | Code shall follow layered architecture (DAO, Service, UI) |
| NFR-5.2 | System shall support configurable database connection parameters |
| NFR-5.3 | System shall log errors with sufficient detail for debugging |

#### 3.3.6 Compatibility Requirements (NFR-6)
| ID | Requirement |
|----|-------------|
| NFR-6.1 | System shall run on Windows 10+ and Linux distributions |
| NFR-6.2 | System shall support MSSQL Server and MySQL databases |
| NFR-6.3 | System shall deploy via Docker with docker-compose |

#### 3.3.7 Scalability Requirements (NFR-7)
| ID | Requirement |
|----|-------------|
| NFR-7.1 | Database design shall support up to 100,000 donor records |
| NFR-7.2 | System shall support multiple blood bank locations |

### 3.6 Software System Attributes

#### 3.6.1 Security
See Section 3.5.1

#### 3.6.2 Usability
See Section 3.5.2

#### 3.6.3 Reliability
See Section 3.5.3

#### 3.6.4 Maintainability
See Section 3.5.4

#### 3.6.5 Portability
See Section 3.5.5

#### 3.6.6 Scalability
See Section 3.5.6

### 3.7 Other Requirements
- Source code shall be maintained in a Git repository
- Build process shall use Maven
- Testing shall include unit and integration tests